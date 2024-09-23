import React from "react";

function Employee( { name , surname , func , exp , image } ){
    return (
        <div style={styles.container}>
            <img src={image} alt="Employee" style={styles.image}/>
            <h1 style={styles.name}>{name} {surname}</h1>
            <table>
                <tr>
                    <td style={styles.label}>Function:</td>
                    <td style={styles.description}>{func}</td>
                </tr>

                <tr>
                    <td style={styles.label}>Experience:</td>
                    <td style={styles.description}>{exp}</td>
                </tr>
            </table>
        </div>
    )
}

const styles = {
    container: {
        border: '1px dashed blue',
        width: '300px',
        background: 'lightblue',
    },

    image: {
        width: '280px',
        height: '300px',
        objectFit: 'cover',
        marginLeft: '10px',
        marginTop: '10px',
        borderRadius: '10%'
    },

    name: {
        textAlign: 'center',
        margin: '5px'
    },

    label: {
        textAlign: 'right'
    },

    description: {
        textAlign: 'left'
    },
}

export default Employee;